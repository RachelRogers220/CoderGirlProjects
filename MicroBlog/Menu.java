package MicroBlog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Menu
{
    static int counter = 0;
    Scanner keyboard = new Scanner(System.in);


    private User currentUser;
    private static ArrayList allUsers = new ArrayList();


    public Menu()
    {
     this.currentUser = currentUser;
     this.allUsers = allUsers;
    }
    public void setCurrentUser(User currentUser)
    {

        this.currentUser = currentUser;
    }

    public void displayMenu()
    {
        System.out.println("Main MicroBlog.Menu \n1) Create a new user \n2) Become an existing user "+
                "\n3) Create a post as the current user \n4) Print all posts \n5) Print all users"+
                "\n6) Exit"+
                "\nYou are currently user \"" + currentUser.getUsername() + "\". What would you like to do?");

        int choice = keyboard.nextInt();
        keyboard.skip("\n");
        if (choice == 1)
        {
            createUser();
        }
        else if (choice == 2)
        {
            becomeUser();
        }
        else if (choice == 3)
        {
            createPost();
        }
        else if (choice == 4)
        {
            printPosts();
        }
        else if (choice == 5)
        {
            printUsers();
        }
        else
        {

        }

    }
    public void createUser()
    {
        System.out.println("Please enter a username: ");
        String username = keyboard.nextLine();
        System.out.println("Please enter your full name: ");
        String fullName = keyboard.nextLine();
        System.out.println("Please enter your email address: ");
        String email = keyboard.nextLine();
        System.out.println("(Optional) Please enter a link to a picture for your profile: ");
        String avatarURL = keyboard.nextLine();

        User firstUser = new User(username, fullName, email, avatarURL);

        allUsers.add(firstUser);
        Menu newMenu = new Menu();
        newMenu.setCurrentUser(firstUser);
        newMenu.displayMenu();

    }
    public void becomeUser()
    {
        Iterator iter = allUsers.iterator();
        int userChoice;
        int counter = 1;
        while(iter.hasNext())
        {
            User currentUser = (User) iter.next();
            System.out.print(counter + ". ");
            System.out.println(currentUser.getUsername());
            counter++;
        }
        System.out.println("Which user would you like to be?");
        userChoice = keyboard.nextInt();
        currentUser = (User)allUsers.get(userChoice-1);
        Menu newMenu = new Menu();
        newMenu.setCurrentUser(currentUser);
        newMenu.displayMenu();

    }
    public void createPost()
    {
        Iterator iter = currentUser.getPosts().iterator();
        while (iter.hasNext())
        {
            Post post = (Post) iter.next();
            System.out.println(post.getPost());
        }

        //System.out.println(currentUser.getPosts());
        System.out.println("Enter your post here: ");
        String postBody = keyboard.nextLine();
        System.out.println("(Optional) add a link here:");
        String url = keyboard.nextLine();
        Post newPost = new Post(currentUser, postBody, url);
        currentUser.addPost(newPost);
        Menu newMenu = new Menu();
        newMenu.setCurrentUser(currentUser);
        newMenu.displayMenu();


    }
    public void printPosts()
    {
        Iterator iter = allUsers.iterator();
        while (iter.hasNext())
        {
            User user = (User) iter.next();
            Iterator iter2 = user.getPosts().iterator();
            while (iter2.hasNext())
            {
                Post post = (Post) iter2.next();
                System.out.println(post.getPost());
            }

        }
        Menu newMenu = new Menu();
        newMenu.setCurrentUser(currentUser);
        newMenu.displayMenu();
    }
    public void printUsers()
    {
        System.out.println("Users:");
        Iterator iter = allUsers.iterator();
        while(iter.hasNext())
        {
            User user = (User) iter.next();
            System.out.println(user.getUsername());
        }
        System.out.println();
        Menu newMenu = new Menu();
        newMenu.setCurrentUser(currentUser);
        newMenu.displayMenu();

    }

    public static void main(String[] args)
    {
        User defaultUser = new User("default","default","default","default");
        allUsers.add(defaultUser);
        Post defaultPost = new Post(defaultUser, "default post", "");
        defaultUser.addPost(defaultPost);
        Menu newMenu = new Menu();
        newMenu.setCurrentUser(defaultUser);
        newMenu.displayMenu();
        //System.out.println(currentUser);
    }

}
