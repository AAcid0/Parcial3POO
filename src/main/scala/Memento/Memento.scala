package Memento
import Originador.Originador

class Memento
{
    var _marca : String = _
    var _modelo : String = _
    var _precio : String = _

    def this(ma : String, mo : String, pr : String)
    {
        this()
        _marca = ma
        _modelo = mo
        _precio = pr
    }

    def getEstado() : Originador =
    {
        var nuevoOriginador = new Originador(_marca, _modelo, _precio)
        return nuevoOriginador
    }
}