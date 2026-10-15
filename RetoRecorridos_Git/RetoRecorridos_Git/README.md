# RetoRecorridos — Árbol binario de búsqueda

Proyecto Java organizado para trabajar con Git/GitHub. Implementa recorridos preorden, inorden y posorden, además del cálculo de altura de un árbol binario de búsqueda.

## Estructura

```text
RetoRecorridos_Git/
├── src/
│   └── main/
│       └── java/
│           └── reto/
│               ├── Estudiante.java
│               ├── NodoEstudiante.java
│               └── RetoRecorridos.java
├── .gitignore
└── README.md
```

## Requisitos

- JDK 8 o superior.
- Git (opcional, para subir el proyecto a GitHub).

## Compilar y ejecutar

Abre una terminal en la carpeta raíz del proyecto.

**Windows (PowerShell):**

```powershell
javac -d out src/main/java/reto/*.java
java -cp out reto.RetoRecorridos
```

**Linux/macOS:**

```bash
mkdir -p out
javac -d out src/main/java/reto/*.java
java -cp out reto.RetoRecorridos
```

El programa imprime trazas de los tres recorridos y la altura para los casos incluidos en `main`.

## Subir a GitHub

1. Crea un repositorio vacío en GitHub (sin README ni `.gitignore`, porque ya vienen incluidos).
2. Abre la terminal dentro de esta carpeta.
3. Ejecuta los comandos, reemplazando la URL por la de tu repositorio:

```bash
git init
git add .
git commit -m "Estructura inicial del reto de recorridos"
git branch -M main
git remote add origin https://github.com/TU-USUARIO/TU-REPOSITORIO.git
git push -u origin main
```

Si ya clonaste un repositorio, no ejecutes `git init` ni `git remote add origin`; copia estos archivos dentro del repositorio existente y luego ejecuta `git add .`, `git commit -m "Organiza proyecto Java por carpetas"` y `git push`.

## Notas

- `RetoRecorridos.java` conserva la lógica y los casos de prueba del archivo proporcionado.
- `Estudiante.java` y `NodoEstudiante.java` se incluyen para que el proyecto compile y se ejecute de forma independiente.
- La carpeta `out/` se genera al compilar y no se sube a Git.
