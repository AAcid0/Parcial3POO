package Protector
import Memento.Memento

class Protector
{
    var _historial : List[Memento] = List()

    def historial = _historial

    def agregarMemento(m : Memento) : Unit =
    {
        _historial = _historial :+ m
        println("Memento agregado al historial.")
    }

    def getMemento() : Memento =
    {
        return historial.head
    }
}