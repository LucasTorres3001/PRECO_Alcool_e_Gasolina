<%@page import="valor.combustivel.Preco"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                
                Preco preco = new Preco();
                
                String opcao = request.getParameter("opcaoDeCombustivel");
                String volume_txt = request.getParameter("volume");
                double volume = Double.parseDouble(volume_txt);
                
                preco.setTipoDoCombustivel(opcao);
                preco.setVolumeDoCombustivel(volume);
                
                out.print(preco.doCombustivel());
            }
            catch(Exception e){
                out.print("<h3>Error :/ ... " + e.getMessage() + "</h3>");
            }
        %>
    </body>
</html>
