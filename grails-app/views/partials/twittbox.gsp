    <div class="twittBox" ng-controller="TwittboxCtrl" >
        <div class="twittBoxHeader"><h1>What's happening now?</h1></div>
        <div ng-repeat="aTwitt in twittList.list" class="twitt">
            <div class="date">{{aTwitt.date}}</div>
            <div class="username">{{aTwitt.username}}</div>
            <div class="content">{{aTwitt.content}}</div>
        </div>
    </div>