package com.epam.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 *
 * @author Olha_Babenko
 */
public interface Command {

    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}
