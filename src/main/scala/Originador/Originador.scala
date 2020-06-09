package Originador
import Memento.Memento

class Originador
{
    private var _marca : String = _
    private var _modelo : String = _
    private var _precio : String = _

    def marca = _marca
    def modelo = _modelo
    def precio = _precio

    def this(mar : String, mod : String, pre : String)
    {
        this()
        _marca = mar
        _modelo = mod
        _precio = pre
    }

    def mostrarInfo(obj : Originador) : Unit = {
        println("El auto es marca: " + obj.marca + ", Modelo: " + obj.modelo + ", y su precio es: " + obj.precio)
    }

    def modInfo(mar : String, mod : String, pre : String) : Unit = {
        _marca = mar
        _modelo = mod
        _precio = pre
    }

    def restaurarEstado(m : Memento) : Originador = 
    {
        println("Restaurando a estado anterior.")
        var nuevoOriginador = new Originador(m._marca, m._modelo, m._precio)
        return nuevoOriginador
    }

    def crearMemento() : Memento =
    {
        println("Creando memento del estado actual.")
        var nuevoMemento = new Memento(marca, modelo, precio)
        return nuevoMemento
    }
}