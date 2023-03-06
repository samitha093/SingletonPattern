public class Machine {
    private static Machine instance = null;

    private Machine(){}

    public static Machine getnew(){
        if(instance == null){
            instance = new Machine();
        }
        return instance;

    }
}
