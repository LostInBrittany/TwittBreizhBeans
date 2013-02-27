<!-- Main hero unit for a primary marketing message or call to action -->
<div class="hero-unit">
    <div class="container">
        <h1>Twitt BreizhBeans</h1>
        <p>A BreizhBeans demo app made with AngularJS, Grails and MongoDB.</p>
        <div class="btn-signing">
            <button ng-click="signing()" class="btn btn-primary">Join now</button> or
            <button ng-click="signing()" class="btn btn-success">Sign in</button>
        </div>
    </div>
</div>

<div class="container">

    <!--
    <form name="twittForm">
        <div class="control-group" ng-class="{error: twittForm.name.$invalid}">
            <label>User :</label>
            <input type="text" name="user" ng-model="twitt.user" required>
            <span ng-show="twittForm.name.$error.required" class="help-inline">
                Required
            </span>
        </div>
        <div class="control-group" ng-class="{error: twittForm.name.$invalid}">
            <label>Share :</label>
            <input type="text" name="content" ng-model="twitt.content" required>
            <span ng-show="twittForm.name.$error.required" class="help-inline">
                Required
            </span>
        </div>
        <button ng-click="save()" ng-hide="isClean() || twittForm.$invalid"
                ng-disabled="isClean() || twittForm.$invalid"
                class="btn btn-primary">Save</button>
    </form>
    -->
    <div class="twittBox">
        <div class="twittBoxHeader"><h1>What's happening now?</h1></div>
        <div ng-repeat="aTwitt in twittList.list" class="twitt">
            <div class="date">{{aTwitt.date}}</div>
            <div class="username">{{aTwitt.username}}</div>
            <div class="content">{{aTwitt.content}}</div>
        </div>
    </div>
</div>

<div  class="signing-panel container" ng-show="signingPanelIsShown()">

    <div class="signing-forms-panel">
        <button class="btn btn-danger exit" ng-click="exitSigning()">X</button>

        <h2>Please sign up or sign in</h2>

        <div class="forms">
            <form class="form-sign-up">
                <div>
                    <h3 class="form-sign-up-heading">Sign up</h3>
                    <input type="text" class="input-block-level" placeholder="Username">
                    <input type="password" class="input-block-level" placeholder="Password">
                    <input type="password" class="input-block-level" placeholder="Re-type password">
                </div>
                <button class="btn btn-primary" type="submit">Sign up</button>
            </form>

            <div class="vert-separator">  </div>


            <form class="form-sign-in">
                <div>
                    <h3 class="form-sign-in-heading">Please sign in</h3>
                    <input type="text" class="input-block-level" placeholder="Email address">
                    <input type="password" class="input-block-level" placeholder="Password">
                    <label class="checkbox">
                        <input type="checkbox" value="remember-me"> Remember me
                 </label>
                </div>
                <button class="btn btn-success" type="submit">Sign in</button>
            </form>
        </div>
    </div>

</div>