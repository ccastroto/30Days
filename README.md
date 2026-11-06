# 🏎️ 30 Días de Audi (30 modelos en 30 días)

Una aplicación para Android desarrollada con **Jetpack Compose** y **Material Design 3**, que explora y celebra **30 modelos emblemáticos de la marca Audi** a través de la historia, abarcando desde la década de los 70 hasta los modelos 100% eléctricos de la década actual.

---

## 📱 Características Principales

- **Exploración Histórica**: Lista detallada de 30 modelos legendarios de Audi (Audi 100, Audi 80, Quattro, Sport Quattro, R8, RS6, e-tron GT, entre otros).
- **Tarjetas Interactivas y Desplegables**: Cada tarjeta de vehículo se despliega al tocar el botón de expansión para mostrar información histórica detallada.
- **Animaciones Fluidas**: Animaciones de tamaño y resorte (`animateContentSize` y `spring`) al expandir o colapsar información.
- **Interfaz Material 3**: Diseño moderno adaptado con componentes de Material Design 3 (`Scaffold`, `Card`, `CenterAlignedTopAppBar`, `LazyColumn`, etc.) y esquema de colores personalizado.
- **Formato Visual Claro**: Clasificación por década, tipo de carrocería (coupé, sedán, avant, cabriolet, SUV, superdeportivo) y fotografía descriptiva.

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Diseño**: Material Design 3 (`androidx.compose.material3`)
- **Iconografía**: Compose Material Icons Extended
- **Mínimo SDK**: API 24 (Android 7.0)
- **Target SDK**: API 37

---

## 📂 Estructura del Proyecto

```text
app/src/main/java/com/example/a30days/
├── MainActivity.kt        # Actividad principal y componentes Compose (AudiApp, Panel, AudiTopBar, etc.)
├── data/
│   └── Audi.kt            # Data class 'Audi' y la lista de datos de los 30 modelos
└── ui/theme/
    ├── Color.kt           # Paleta de colores de la aplicación
    ├── Theme.kt           # Configuración del tema Material 3 (_30DaysTheme)
    └── Type.kt            # Definición de tipografías
```

---

## 🚀 Cómo Ejecutar el Proyecto

1. **Clonar o abrir el repositorio** en [Android Studio](https://developer.android.com/studio).
2. Asegurarse de tener configurado el SDK de Android (mínimo API 24).
3. Sincronizar el proyecto con los archivos de Gradle (`Gradle Sync`).
4. Seleccionar un dispositivo emulador o físico conectado y presionar **Run ('app')** (`Shift + F10`).

---

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos como parte del aprendizaje y práctica en Android con Jetpack Compose.

 ## Desarrollado
 Este proyecta ha sido desarrollado por Carlos Castro Aldrover 2º DAM (@ccastroto)
