# Reto Técnico Automatizador 🤖

Este proyecto contiene la automatización de pruebas para servicios API REST (Reqres.in) y pruebas E2E (Floristería Mundo Flor), desarrollado como parte de un reto técnico de automatización.

## 🛠 Tecnologías y Herramientas

### API Testing (Reqres.in)
* **Java**: Lenguaje de programación principal
* **Serenity BDD**: Framework de automatización
* **Rest Assured**: Biblioteca para pruebas de API REST
* **Cucumber**: Framework para BDD
* **JUnit**: Framework de pruebas unitarias
* **Gradle**: Herramienta de construcción y gestión de dependencias

### E2E Testing (Floristería Mundo Flor)
* **Java**: Lenguaje de programación principal
* **Serenity BDD**: Framework de automatización
* **Selenium WebDriver**: Herramienta de automatización web
* **Cucumber**: Framework para BDD
* **JUnit**: Framework de pruebas unitarias
* **Gradle**: Herramienta de construcción
* **Patrón Screenplay**: Patrón de diseño para pruebas

### Entorno de Desarrollo
* **IntelliJ IDEA**: IDE principal

## 📋 Pre-requisitos

* Java JDK 11 o superior
* Gradle 7.x o superior
* IntelliJ IDEA
* Navegador web (Chrome/Firefox)
* Git

## 🚀 Instalación y Configuración

### 1. Clonar el Repositorio
```bash
git clone https://github.com/IvanBarajas95/RetoTecnicoAutomatizador.git
cd RetoTecnicoAutomatizador
```

### 2. Configurar el Proyecto
1. Abrir IntelliJ IDEA
2. Seleccionar: File → Open
3. Navegar hasta la carpeta del proyecto y seleccionarla
4. Esperar a que se complete la indexación y la sincronización de Gradle

### 3. Configurar Variables de Entorno
Asegúrate de tener configurada la variable JAVA_HOME apuntando a tu JDK

## ▶️ Ejecución de Pruebas

### Ejecutar Todas las Pruebas
```bash
gradle clean test

```

## 📊 Reportes de Pruebas

Los reportes de Serenity se generan automáticamente después de cada ejecución y se pueden encontrar en:
```
target/site/serenity/index.html
```

## 🔍 Casos de Prueba Automatizados

### API Testing (Reqres.in)
1. **Listar Usuarios**
   * Método: GET
   * Endpoint: /api/users?page=2
   * Validación: Status 200 y lista de usuarios

2. **Crear Usuario**
   * Método: POST
   * Endpoint: /api/users
   * Validación: Status 201 y datos del usuario creado

3. **Actualizar Usuario**
   * Método: PUT
   * Endpoint: /api/users/{id}
   * Validación: Status 200 y datos actualizados

4. **Eliminar Usuario**
   * Método: DELETE
   * Endpoint: /api/users/{id}
   * Validación: Status 204

### E2E Testing (Floristería)
1. **Navegación a Categoría Agradecimientos**
   * Acceso a la página principal
   * Selección de categoría
   * Validación de productos mostrados

2. **Agregar Productos al Carrito**
   * Selección de productos
   * Agregar al carrito
   * Validación de agregado exitoso

3. **Validación del Carrito**
   * Acceso al carrito
   * Verificación de productos agregados
   * Validación de detalles correctos

## 👨‍💻 Autor

**Ivan Barajas**
* GitHub: [@IvanBarajas95](https://github.com/IvanBarajas95)
* Email: iaovalle1@misena.edu.co

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE.md](LICENSE.md) para detalles

---
⌨️ con ❤️ por [Ivan Barajas](https://github.com/IvanBarajas95)
