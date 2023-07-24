<!-- signup.jsp -->

<!DOCTYPE html>
<html>
  <head>
    <title>Sign Up Page</title>
  </head>
  <body>
    <h1>Sign Up</h1>
    <form action="processSignup.jsp" method="post">
      <label for="username">Username:</label>
      <input type="text" name="username" id="username" required />
      <br />
      <label for="email">Email:</label>
      <input type="email" name="email" id="email" required />
      <br />
      <label for="password">Password:</label>
      <input type="password" name="password" id="password" required />
      <br />
      <input type="submit" value="Sign Up" />
    </form>
  </body>
</html>
