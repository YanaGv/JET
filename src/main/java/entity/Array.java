package entity;


public class Array<N extends Number>{
    int[] array;

    public Array() {
        this.array = new int[0];
    }
    public Array(int ... args) {
        int size = args.length;
        this.array = new int[size];
        for(int i: args){
            this.array[i] = args[i];
        }
    }
    public int getById(int id){
        try {
            return this.array[id];
        }catch (Exception ex){
            System.out.println("Array exception");
        }
        return 0;
    }
    public int lenght(){
        return this.array.length;
    }
}
