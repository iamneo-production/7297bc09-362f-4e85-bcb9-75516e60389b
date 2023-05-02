#!/bin/bash

if [ -d "/home/coder/project/workspace/angularapp" ]
then
    echo "project folder present"
    cp /home/coder/project/workspace/karma/karma.conf.js /home/coder/project/workspace/angularapp/karma.conf.js;
    
    # checking for login component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/auth/login" ]
    then
        cp /home/coder/project/workspace/karma/login.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/auth/login/login.component.spec.ts;
    else
        echo "FE_loginTest FAILED";
    fi 

    # checking for signup component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/auth/signup" ]
    then
        cp /home/coder/project/workspace/karma/signup.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/auth/signup/signup.component.spec.ts;
    else
        echo "FE_signupTest FAILED";
    fi 

    # checking for addgifts component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/adminside/addgifts" ]
    then
        cp /home/coder/project/workspace/karma/addgifts.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/adminside/addgifts/addgifts.component.spec.ts;
    else
        echo "FE_addGiftsTest FAILED";
    fi 

     # checking for adminhomepage component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/adminside/adminhomepage" ]
    then
        cp /home/coder/project/workspace/karma/adminhomepage.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/adminside/adminhomepage/adminhomepage.component.spec.ts;
    else
        echo "FE_adminHomePageTest FAILED";
    fi

        # checking for order component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/adminside/order" ]
    then
        cp /home/coder/project/workspace/karma/order.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/adminside/order/order.component.spec.ts;
    else
        echo "FE_orderTest FAILED";
    fi


    # checking for adminreview component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/adminside/adminreview" ]
    then
        cp /home/coder/project/workspace/karma/adminreview.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/adminside/adminreview/adminreview.component.spec.ts;
    else
        echo "FE_adminReviewTest FAILED";
    fi

    
    # checking for cart component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customerside/cart" ]
    then
        cp /home/coder/project/workspace/karma/cart.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customerside/cart/cart.component.spec.ts;
    else
        echo "FE_cartTest FAILED";
    fi 

    # checking for customerorder component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customerside/customerorder" ]
    then
        cp /home/coder/project/workspace/karma/customerorder.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customerside/customerorder/customerorder.component.spec.ts;
    else
        echo "FE_customerOrderTest FAILED";
    fi 

    # checking for userhomepage component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customerside/userhomepage" ]
    then
        cp /home/coder/project/workspace/karma/userhomepage.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customerside/userhomepage/userhomepage.component.spec.ts;
    else
        echo "FE_userHomePageTest FAILED";
    fi 

    # checking for userreview component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customerside/userreview" ]
    then
        cp /home/coder/project/workspace/karma/userreview.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customerside/userreview/userreview.component.spec.ts;
    else
        echo "FE_userReviewTest FAILED";
    fi 

    cd /home/coder/project/workspace/angularapp/;
    npm test;
else   
    echo "FE_loginTest FAILED";
    echo "FE_signupTest FAILED";
    echo "FE_addGiftsTest FAILED";
    echo "FE_adminHomePageTest FAILED";
    echo "FE_orderTest FAILED";
    echo "FE_adminReviewTest FAILED";
    echo "FE_cartTest FAILED";
    echo "FE_customerOrderTest FAILED";
    echo "FE_userHomePageTest FAILED";
    echo "FE_userReviewTest FAILED";
fi

