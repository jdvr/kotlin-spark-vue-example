<template>
    <div>
        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo">Logbook</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#">Navbar Link</a></li>
                </ul>

                <ul id="nav-mobile" class="side-nav">
                    <li><a href="#">Navbar Link</a></li>
                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">{{ now }}</i></a>
            </div>
        </nav>
        <div class="section no-pad-bot" id="index-banner">
            <div class="container">
                <br><br>
                    <h1 class="header center orange-text">Starter Template</h1>
                    <div class="row center">
                        <h5 class="header col s12 light">A modern responsive front-end framework based on Material Design</h5>
                    </div>
                    <div class="row center">
                        <a href="http://materializecss.com/getting-started.html" id="download-button" class="btn-large waves-effect waves-light orange">Get Started</a>
                    </div>
                    <br><br>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    name: 'appheader',
    computed: {
        now(){
            let now = new Date();
            return `${now.getDate()}/${now.getMonth() + 1}/${now.getFullYear()}`
        }
    }
}
</script>
