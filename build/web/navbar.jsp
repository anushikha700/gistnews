<%
    String url = request.getRequestURI();
    request.setAttribute("url", url);
    %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#"> Gist News .....</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
              <a class="nav-link ${url.contains("index.jsp")?" active":""}" href="index.jsp"> <i class="fa fa-home"></i> Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"> About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
              <a class="nav-link  ${url.contains("contact.jsp")?" active":""}" href="contact.jsp">Contact</a>
          </li>
          
          <li class="nav-item">
              <a class="nav-link" href="login.jsp"> <i class="fa fa-lock"></i> &nbsp;&nbsp;Login</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>    