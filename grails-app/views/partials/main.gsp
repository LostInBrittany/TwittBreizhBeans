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

<div   ng-show="signformIsShown()">
    <h1>Hello !</h1>

</div>