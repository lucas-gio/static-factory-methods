# Static Factory Methods - Métodos fábrica estáticos.
Pueden proveerse en reemplazo o en conjunto con constructores.

#### Ventajas
* Tener un nombre, lo que lo hace más descriptivo y fácil de comprender. Además su creación hace que se evite la posibilidad de que existan diversos constructores iguales (con los mismos parámetros pero en diferente orden).

* Poder retornar o bien nuevas instancias, como constructores, o bien utilizar un caché de instancias, o bien la misma instancia siempre. Esto permite mejorar el rendimiento si no es necesario crear una nueva instancia. Además, si se retorna siempre la misma, se dice que la clase constrola su instancia, garantizando así que sea un singleton o no instanciable.

    Ejemplos:
    > Método getInstance() de cualquier singleton.

    > public static Boolean valueOf(boolean b){ return b ? Boolean.TRUE : Boolean.FALSE;}

* Poder retornar una instancia de una subclase.
* Poder retornar una u otra subclase dependiendo de alguna condición. Como el tipo de retorno tiene mayor jerarquía, queda invisible a los clientes.

    Ejemplo:
    > La clase EnumSet retorna un RegularEnumSet si el enum tiene 64 o menos elementos, y en caso contrario un JumboEnumSet. Si en algún momento se desea cambiar de subclase porque ofrece mejor rendimiento, por ej., se podría cambiar sin problemas, siendo todo transparente para los usuarios.
    
    #### Desventajas
* Si sólo se incluyen estos métodos, sin constructores, la clase no se puede extender. Sin embargo puede ser una ventaja para que se use composición en lugar de herencia.

* No se encuentran a simple vista. Por eso, se debería seguir un nombre convencional, además de estar documentado claramente su utilidad.

