# Aplicación de Cálculo del Número PI

Este programa Java calcula el número PI de forma iterativa utilizando una clase llamada `Matematicas`. La clase principal del programa es `Principal`, que se encuentra en el paquete `aplicacion`.

## Estructura del Proyecto

El proyecto está organizado en dos paquetes:
- `aplicacion`: Contiene la clase `Principal`.
- `mates`: Contiene la clase `Matematicas`.

## Clases

### Principal
```java
package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
    }
}
