public class ListTesterDos {
    public static void main(String[] args) {
        List dos = new LList<Integer>();

        System.out.println(dos);
        dos.add(2);

        System.out.println(dos);
        dos.add(5);

        System.out.println(dos);
        dos.add(7);

        System.out.println(dos);
        dos.add(11);

        System.out.println(dos);
        dos.add(3);

        System.out.println(dos);
        dos.add(51);

        System.out.println(dos);
        dos.add(4);

        System.out.println(dos);
        dos.add(-1);

        System.out.println(dos);
        
        for( int i=0; i<7; i++ ) {
        int n = (int)( dos.size() * Math.random() );
        int imposter = 1000;
        System.out.println("adding imposter at index " + n + "...");
        dos.add( n, imposter );
        System.out.println("Updated list: " + dos);
        }

        while( dos.size() > 0 ) {
        int n = (int)( dos.size() * Math.random() );
        System.out.println("deleting node "+ n + "...");
        dos.remove(n);
        System.out.println("Updated list: " + dos);
    }
    }
}