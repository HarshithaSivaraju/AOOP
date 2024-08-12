package Login.com;

public class Main {
public static void main(String[] args)
{
	LoginSystem login_user1 = LoginSystem.getUser();
	login_user1.login("Harshitha");
    login_user1.logout();
    LoginSystem user2 = LoginSystem.getUser();
    user2.login("Krishna");
}
}
