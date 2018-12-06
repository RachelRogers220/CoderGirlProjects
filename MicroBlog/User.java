package MicroBlog;

import java.util.ArrayList;

public class User
{
    private String username;
    private String fullName;
    private String email;
    private String avatarURl;
    //private MicroBlog.Post[] posts = new MicroBlog.Post[100];
    int counter = 0;
    private ArrayList posts = new ArrayList();

    public User(String username, String fullName, String email, String avatarURl)
    {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.avatarURl = avatarURl;
    }

    //void addPost(MicroBlog.Post p)
    public void addPost(Post p)
    {
        posts.add(p);

    }

    public ArrayList getPosts()
    {

        return posts;
    }

    public String getUsername()
    {

        return username;
    }

    public String getFullName()
    {

        return fullName;
    }

    public String getEmail()
    {

        return email;
    }

    public String getAvatarURl()
    {

        return avatarURl;
    }
}
