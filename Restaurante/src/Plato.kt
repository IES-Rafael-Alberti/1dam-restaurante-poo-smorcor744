class Plato(nombre: String, precio:Double, tiempoPreparacion: Int, ingredientes: MutableList<String>) {
    var nombre = nombre
        set(value) {
            require(value.isNotBlank()) {"El nombre no puede estar vacío."}
            field = value
        }
    var precio = precio
        set(value) {
            require(value > 0) {"El precio debe de ser mayor a 0."}
            field = value
        }
    var tiempoPreparacion: Int = tiempoPreparacion
        set(value) {
            require(value>1)
            field = value
        }
    var ingredientes = ingredientes
        set(value) {
            require(value.all { it.isNotEmpty() }) { "Los ingredientes no pueden ser nulos o vacíos." }
            field = value
        }

    fun agregarIngrediente(ingrediente: String) {
        require(ingrediente.isNotEmpty())
         this.ingredientes.add(ingrediente)
    }

    override fun toString(): String = "$nombre ($tiempoPreparacion min.) -> $precio€ ($ingredientes)"
}