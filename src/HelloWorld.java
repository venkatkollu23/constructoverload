public class HelloWorld{


    public void show(){
        System.out.prinltn("HelloWorld");
    }
    public String demoMerge(){


        System.out.pritnln(" demo merge");
        return  "";
    }


    public String sayHi(){
        HelloWorldService hs = new HelloWorldService();
       String studentData = hs.getData();

        if (studentData != null){
            return "Stash changes";

        }

    }

}