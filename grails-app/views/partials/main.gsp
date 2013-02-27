<!-- Main hero unit for a primary marketing message or call to action -->
<div class="hero-unit">
    <h1>Twitt BreizhBeans</h1>
    <p>Twitt BreizhBeans is a demo app made with AngularJS et MongoDB.</p>
</div>

<div class="container">

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
</div>