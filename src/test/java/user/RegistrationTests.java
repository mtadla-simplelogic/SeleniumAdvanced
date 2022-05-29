package user;

import base.Pages;
import helpers.RandomHelper;
import models.SocialTitle;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationTests extends Pages {

    @Test
    public void shouldRegisterNewUser() {
        topMenuPage.goToSignIn();

        loginPage.goToRegistration();

        registrationPage
                .selectSocialTitle(SocialTitle.Mr)
                .setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("123qwe")
                .acceptPolices()
                .submitForm();

        assertThat(topMenuPage.getLoggedInUserName()).isEqualTo("Jan Kowalski");
    }

    @Test
    public void shouldRegisterNewUserFullFluent() {
        topMenuPage
                .goToSignIn()
                .goToRegistration()
                .selectSocialTitle(SocialTitle.Mr)
                .setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("123qwe")
                .acceptPolices()
                .submitForm();

        assertThat(topMenuPage.getLoggedInUserName()).isEqualTo("Jan Kowalski");
    }

    @Test
    public void shouldRegisterNewUserFullFluent2() {
        assertThat(
                topMenuPage
                        .goToSignIn()
                        .goToRegistration()
                        .selectSocialTitle(SocialTitle.Mr)
                        .setFirstName("Jan")
                        .setLastName("Kowalski")
                        .setEmail(RandomHelper.getRandomEmail())
                        .setPassword("123qwe")
                        .acceptPolices()
                        .submitForm()
                        .getLoggedInUserName()).isEqualTo("Jan Kowalski");
    }
}
