package singleton;

public class SingletonService {
    //static 이라고하면 static 영역에 밑에 하나만 딱 올라감
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
