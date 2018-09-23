package sanz.git.project.stack;

public class RunGenericStack {
    public RunGenericStack() {
        GenericStack<String> kk = new GenericStack<>();
        System.out.println(kk.isEmpty());
        kk.push("Sanjeet");
        kk.push("33");
        kk.push("22");
        kk.push("11");
//        System.out.println(kk.pop());
//        System.out.println(kk.peek());
        System.out.println(kk.search("Sanjeet"));
    }
}
