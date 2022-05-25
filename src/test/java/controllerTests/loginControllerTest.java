//package controllerTests;
//
//import resource.LoginResource;
//import dtos.LoginDTO;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//public class loginControllerTest {
//    private LoginResource sut;
//    private LoginDTO login;
//
//    @Before
//    public void setup(){
//        sut = new LoginResource();
//    }
//
//    @Test
//    public void loginReturnsCorrectResponseToken(){
//        login = new LoginDTO("cuneyt", "MySuperSecretPassword12341" );
//        String token = "{\"token\": \"1234-1234-1234\", \"user\": \"Cuneyt Ozturk\"}";
//
//        Response expected = Response
//                .status(Response.Status.OK)
//                .entity(token)
//                .type(MediaType.APPLICATION_JSON)
//                .build();
//
//        Response actual= sut.login(login);
//
//        //Als ik geen getEntity gebruik in de assert krijg ik een testfailed, zelfs als ik de expected kopieer naar de actual. De comparison viewer
//        // zegt dat de content identiek is.. De token is hier het belangrijkst, dus vergelijk ik de entity van de response.
//        Assert.assertEquals(expected.getEntity(), actual.getEntity());
//    }
//
//    @Test
//    public void loginReturnsBadRequestResponseWhenPasswordWrong(){
//        login = new LoginDTO("cuneyt", "WrongPassword" );
//
//        Response expected = Response.status(Response.Status.BAD_REQUEST).entity(login).type(MediaType.APPLICATION_JSON).build();
//        Response actual = sut.login(login);
//
//        //Dezelfde error als de test hierboven, ondanks dezelfde content. De status van de Response is hier het belangrijkste,
//        //vandaar dat ik gebruik maak van getStatus().
//        Assert.assertEquals(expected.getStatus(),actual.getStatus());
//    }
//}
