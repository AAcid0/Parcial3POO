package Main
import Memento.Memento
import Originador.Originador
import Protector.Protector

object Main extends App
{
    /*Se crea el estado inicial de un carro*/
    var carro = new Originador("Mazda", "2015", "90000")
    carro.mostrarInfo(carro)

    /*Se crea el objeto Protector - Caretaker*/
    var caretaker = new Protector

    /*Se guarda el primer estado del carro*/
    caretaker.agregarMemento(carro.crearMemento())

    /*Se modifica el estado del carro creado*/
    carro.modInfo("Chevrolet", "2018", "85000")
    carro.mostrarInfo(carro)

    /*Se retorna el objeto carro al estado anterior*/
    carro = carro.restaurarEstado(caretaker.getMemento())
    carro.mostrarInfo(carro)
    
}