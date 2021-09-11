    @Override
    public boolean equals(Object obj) {
    if(obj instanceof Animal){ //instanceof, si obj es una intancia de la clase
    Animal objetoAnimal = (Animal) obj; //convertimos obj y la convertimos en la variable de tipo Animal
    if(this.identificacion==objetoAnimal.identificacion){
    return true;
    }
    else {
    return false;
    }
    }
    else{
    return false;
    }
    }
    @Override
    public int hashCode() {
    return super.hashCode(); 
    }
     
Este es el equals hecho manualmente con el hasCode.