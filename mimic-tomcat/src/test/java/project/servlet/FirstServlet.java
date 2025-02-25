package project.servlet;

import com.attackonarchitect.http.MTRequest;
import com.attackonarchitect.http.MTResponse;
import com.attackonarchitect.servlet.MimicServlet;
import com.attackonarchitect.servlet.WebServlet;

import java.io.UnsupportedEncodingException;

/**
 * @description:
 */

@WebServlet("/hello/*")
public class FirstServlet extends MimicServlet {

    @Override
    protected void doPost(MTRequest req, MTResponse response) {

    }
    @Override
    protected void doGet(MTRequest req, MTResponse response) throws UnsupportedEncodingException {
        response.writeAndFlush(this.getClass().getName() + " inside /hello/*");
    }
}
