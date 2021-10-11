<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <main>
            <header>
                <h1>Preço do combustivel</h1>
            </header>
            <section>
                <form action="indexII.jsp" method="POST" name="formulary" id="Form" target="precoDoCombustivel">
                    <fieldset>
                        <legend>Combustivel</legend>
                        <p>
                            <input type="radio" name="opcaoDeCombustivel" id="combustivel" value="Alcool" title="Alcool"><label for="combustivel" title="Alcool">Alcool</label>
                            <input type="radio" name="opcaoDeCombustivel" id="combustible" value="Gasolina" title="Gasolina"><label for="combustible" title="Gasolina">Gasolina</label>
                        </p>
                        <fieldset>
                            <p>
                                <label for="Vol" title="Volume de combustivel">Digite o volume de combustivel:</label>
                                <input type="text" name="volume" id="Vol" size="9" maxlength="9" placeholder="litro" title="Volume de combustivel" required="">
                                L
                            </p>
                        </fieldset>
                    </fieldset>
                    <br>
                    <button type="submit" name="Click" id="click" value="Preco" title="Calcular o preço">Calcular o preço</button>
                </form>
                <br>
                <iframe name="precoDoCombustivel" id="preco" height="144" width="676" title="precoDoCombustivel"></iframe>
            </section>
        </main>
    </body>
</html>
