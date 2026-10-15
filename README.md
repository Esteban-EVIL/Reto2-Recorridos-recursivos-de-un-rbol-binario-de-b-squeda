[README (1).md](https://github.com/user-attachments/files/33494096/README.1.md)
# Reto: recorridos recursivos de un árbol binario de búsqueda

Universidad Técnica de Ambato · FISEI · Carrera de Software
Estructura de Datos · Paralelo SW-N3-A

## Situación

Se insertan en un árbol binario de búsqueda (ABB), en este orden, las matrículas:

```
45, 25, 70, 10, 30, 60, 90, 27, 65
```

## Árbol resultante

![Árbol binario de búsqueda](docs/arbol.png)

```
            45
         /      \
       25        70
      /  \      /  \
    10    30  60    90
         /      \
        27       65
```

## Recorridos (predicción y resultado)

| Recorrido | Orden de visita | Resultado |
|-----------|-----------------|-----------|
| Preorden  | nodo → izquierda → derecha | 45 25 10 30 27 70 60 65 90 |
| Inorden   | izquierda → nodo → derecha | 10 25 27 30 45 60 65 70 90 |
| Posorden  | izquierda → derecha → nodo | 10 27 30 25 65 60 90 70 45 |

**Altura (extra):** 3 aristas (caminos 45→25→30→27 y 45→70→60→65).

La predicción hecha a mano coincide con la salida del programa. El inorden sale ordenado de menor a mayor, lo que confirma que el árbol cumple la propiedad de ABB.

## Implementación

Los tres recorridos y la altura son recursivos (sin bucles ni ordenamiento de listas). El caso base es `nodo == null` y hay una llamada recursiva por cada hijo. Entre un recorrido y otro solo cambia el lugar donde ocurre la visita.

Cada método imprime una traza con sangría de 2 espacios por nivel, que muestra la pila de llamadas:

- `entra <matricula>` al llegar a un nodo
- `null -> regresa` en el caso base
- `VISITA <matricula>` al procesar el nodo (también se agrega a la salida)

Altura: un árbol vacío vale -1, una hoja vale 0 y cualquier otro nodo vale `1 + max(altura(izq), altura(der))`.

## Casos límite

| Caso | Preorden | Inorden | Posorden | Altura |
|------|----------|---------|----------|--------|
| Árbol vacío | — | — | — | -1 |
| Un solo nodo (50) | 50 | 50 | 50 | 0 |
| Cadena (10, 20, 30, 40) | 10 20 30 40 | 10 20 30 40 | 40 30 20 10 | 3 |
| Repetido (20, 30, 30, 10) | 20 10 30 | 10 20 30 | 10 30 20 | 1 |

En el caso repetido el segundo 30 se ignora al insertar. Ningún caso falla.

## Ejecución

Desde la carpeta `RetoRecorridos_Git/RetoRecorridos_Git`:

```bash
javac -d out src/main/java/reto/*.java
java -cp out reto.RetoRecorridos
```

## Autores

Tenorio Ronquillo Jonathan Sebastian\
Manobanda Puaquiza Italo Esteban 
