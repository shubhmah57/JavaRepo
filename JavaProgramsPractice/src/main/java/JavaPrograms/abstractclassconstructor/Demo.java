package JavaPrograms.abstractclassconstructor;

public abstract class Demo {
    int i;
    int j;
    Demo(){
        this.i=8;
        this.j=9;
    }
    Demo(int i, int j){
        this.i = i;
        this.j = j;
    }

    public void firstMethod(){

    }

    public abstract void  secondMethod();
}

