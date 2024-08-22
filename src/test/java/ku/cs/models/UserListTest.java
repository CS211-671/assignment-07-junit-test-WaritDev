package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("u1", "password1");
        userList.addUser("u2", "password2");
        userList.addUser("u3", "password3");
        // TODO: find one of them
        User foundUser = userList.findUserByUsername("u1");
        // TODO: assert that UserList found User
        String expected = "u1";
        String actual = foundUser.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("u1", "password1");
        userList.addUser("u2", "password2");
        userList.addUser("u3", "password3");
        // TODO: change password of one user
        boolean actual = userList.changePassword("u1", "password1", "newPassword1");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("u1", "password1");
        userList.addUser("u2", "password2");
        userList.addUser("u3", "password3");
        // TODO: call login() with correct username and password
        User actual = userList.login("u1", "password1");
        // TODO: assert that User object is found
        assertNotNull(actual);
        assertEquals("u1", actual.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("u1", "password1");
        userList.addUser("u2", "password2");
        userList.addUser("u3", "password3");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("u1", "123456");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}