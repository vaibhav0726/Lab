public class Lab03_04 {
    public static void main(String[] args) {
        // mutithreading:-
        Thread obj = Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("Vaibhav");
        System.out.println(obj.getId());
        System.out.println(obj.isAlive()); // give message is it in running state or not
        System.out.println(obj.getPriority()); // to get the priority of the thread. it is from 1 to 10
        System.out.println(obj.isDaemon()); // to check is it the daemon thread or not
        System.out.println(Thread.MIN_PRIORITY);
        
        // how to create the multithreaded application
        // two ways to create multithreaded application
        
        // 1:-by implementing the Runnable interface
        // it is known as Functional interface
        // one method
        // run() method

        // lambda expression


        // 2:- by extending the Thread class


    }
}
