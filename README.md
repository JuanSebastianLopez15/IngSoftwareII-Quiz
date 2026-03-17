Patrón de Diseño: Builder 🏗️
Ingeniería de Software II — Quiz

Descripción
Implementación del patrón de diseño Builder en Java, usando como ejemplo una fábrica de computadoras que construye distintos tipos de PC paso a paso.
El patrón Builder permite construir objetos complejos paso a paso, separando el proceso de construcción de la representación final del objeto.

Integrantes del grupo
EstudianteClases desarrolladasJuan Sebastián LópezComputadora.java, BuilderComputadora.java, Director.java, PCGamerBuilder.javaSamuel LadinoPCOficinaBuilder.java, Main.java

Estructura del proyecto
├── Computadora.java           → Producto final (objeto a construir)
├── BuilderComputadora.java    → Interfaz con los pasos de construcción
├── PCGamerBuilder.java        → Builder concreto: PC de alto rendimiento
├── PCOficinaBuilder.java      → Builder concreto: PC básica de oficina
├── Director.java              → Orquesta el orden de construcción
└── Main.java                  → Cliente: ejecuta y muestra resultados en consola

¿Cómo ejecutarlo?
1. Compilar todos los archivos:
bashjavac *.java
2. Ejecutar:
bashjava Main
Requisitos: Java 8 o superior.

Ejemplo de salida en consola
╔══════════════════════════════════╗
║       ENSAMBLANDO PC GAMER       ║
╚══════════════════════════════════╝

  Iniciando ensamblaje...
  ✔ PC Gamer ensamblada con éxito

  Procesador      : Intel Core i9
  RAM             : 32GB DDR5
  Almacenamiento  : 2TB SSD M.2
  Tarjeta Gráfica : ✔ Sí
  Luces RGB       : ✔ Sí

╔══════════════════════════════════╗
║      ENSAMBLANDO PC OFICINA      ║
╚══════════════════════════════════╝

  Procesador      : Intel Core i5
  RAM             : 16GB DDR4
  Almacenamiento  : 512GB SSD
  Tarjeta Gráfica : ✘ No
  Luces RGB       : ✘ No

Webgrafía

Refactoring Guru. (s.f.). Patrón Builder. https://refactoring.guru/es/design-patterns/builder
Refactoring Guru. (s.f.). Ejemplo Builder en Java. https://refactoring.guru/es/design-patterns/builder/java/example
