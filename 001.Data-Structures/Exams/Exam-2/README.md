### Comparación del grafo (pregunta 1 y 2):

```
99 7 43 60 81 23 15 30 79 55 2 3 19 40 61
```

#### Diagrama hecho manualmente

![Diagrama hecho manualmente](/assets/Diagrama_AVL_Pregunta_1.svg "Diagrama hecho manualmente")

#### Diagrama usando el codigo en clase

![Diagrama usando el codigo en clase](/assets/Diagrama_AVL_java1.svg "Diagrama usando el codigo en clase")

![Diagrama usando el codigo en clase](/assets/Diagrama_AVL_pregunta_1_java2.svg "Diagrama usando el codigo en clase")

Despues de comparar los resultados se determino que no hay una diferencia entre el diagrama hecho manualmente y cuando se uso el programa de AVLTree proporsionado en la clase.

### Usando el programa RedBlack proporcionado, inserte la misma secuencia de enteros del punto y explique DONDE y como se comporta como un AVL y por qué lo hace. (pregunta 3)

Se comporta como un AVL en el siguiente nodo:

![Comportamiento como un AVL](/assets/Comportamiento_avl.png "Comportamiento como un AVL")

Ya que en ambos algoritmos tienen que hacer una doble rotación para acomodar al nodo 81 y sus hijos y al nodo 60 y sus hijos.

### Dado un Btree donde cada nodo puede tener 4 elementos, diagrama la inserción de los siguientes elementos y muestre como quedaría el árbol (pregunta 4):

```
98 20 70 15 33 40 56 97 41 63 71 83 6 11
```

![Diagrama del Binary Tree](/assets/Diagrama_BinaryTree.png "Diagrama del Binary Tree")

### Cambie el programa de BTree proporcionado y en lugar de dominios de internet, introduzca los números anteriores como Strings y compare su solución (pregunta 5).

![Diagrama del Binary Tree](/assets/BTree_java.png "Diagrama del Binary Tree")

Se puede observar que hay varios cambios entre ambos.
La primera observación es que en **_mi resolución lo hice con solo 2 niveles,_** mientras que **_el programa lo hizo 3 niveles._**

Creo que el programa **_no considera la regla de la cantidad de flechas._**
