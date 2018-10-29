public class  Post
{
    private User user1;
    private int postNumber;
    private static int nextPostNumber = 1;
    private String post;
    private String URL;

    public Post(User user1, String post, String URL)
    {
        this.user1 = user1;
        this.postNumber = nextPostNumber;
        nextPostNumber++;
        this.post = post;
        this.URL = URL;

    }
    public String getPost()
    {
        System.out.println(user1.getUsername() + ":");
        System.out.println(this.post);
        //System.out.println(postNumber);
        return "";
    }

    public int getPostNumber()
    {
        return postNumber;
    }

    public static void main(String[] args)
    {
        User u1 = new User("JohnnyBoy", "John Smith",
                "JSmith@email.com", "johnsmith.com/me");
        User u2 = new User("U2Bono", "Bono",
                "bono@u2.com", "google.com/bono");
        User u3 = new User("RachelMarie220", "Rachel Rogers",
                "RachelisCool@gmail.com", "Instagram.com/Rachelrogers220");

        Post post1 = new Post(u1, "Hello, World!", "");
        Post post2 = new Post(u2, "@JohnnyBoy \n Hi there!","");

        post1.getPost();
        System.out.println();

        post2.getPost();
        System.out.println();

        System.out.println(u1.getUsername() +"\n"+u1.getFullName()+"\n"+u1.getAvatarURl()+"\n"
        +u1.getEmail());
        System.out.println();

        System.out.println(u2.getUsername() +"\n"+u2.getFullName()+"\n"+u2.getAvatarURl()+"\n"
                +u2.getEmail());
        System.out.println();

        System.out.println(u3.getUsername() +"\n"+u3.getFullName()+"\n"+u3.getAvatarURl()+"\n"
                +u3.getEmail());


    }
}
