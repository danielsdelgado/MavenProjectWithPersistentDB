$baseDir = "src\main\java"
$fullBasePath = Join-Path (Get-Location) $baseDir

Write-Host "Buscando archivos .java en: $fullBasePath"

$files = Get-ChildItem -Path $fullBasePath -Filter "*.java" -Recurse

if ($files.Count -eq 0) {
    Write-Host "No se encontraron archivos .java en la ruta $fullBasePath"
    exit
}

foreach ($file in $files) {
    Write-Host "Archivo encontrado: $($file.FullName)"

    # Leer las primeras 10 líneas para buscar el paquete
    $lines = Get-Content $file.FullName -TotalCount 10
    $packageLine = $lines | Where-Object { $_ -match '^package\s' }

    if ($packageLine) {
        $package = $packageLine -replace '^package\s', '' -replace ';', '' -replace '\s', ''
        Write-Host "  Paquete declarado: $package"

        # Convertir paquete a ruta
        $expectedPath = $package -replace '\.', '\'

        # Obtener la ruta relativa del archivo desde baseDir
        $relativeDir = Split-Path -Path $file.FullName -Parent
        $relativeDir = $relativeDir.Substring($fullBasePath.Length).TrimStart('\')

        Write-Host "  Ruta del archivo (relativa a baseDir): $relativeDir"
        Write-Host "  Ruta esperada según paquete: $expectedPath"

        if ($relativeDir -ne $expectedPath) {
            Write-Host "  --> ERROR: Paquete y ruta no coinciden!"
            Write-Host "-----------------------------------------"
        }
        else {
            Write-Host "  --> OK: Paquete y ruta coinciden."
            Write-Host "-----------------------------------------"
        }
    }
    else {
        Write-Host "  WARNING: No se encontró declaración de paquete en el archivo."
        Write-Host "-----------------------------------------"
    }
}
