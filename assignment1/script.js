const popup = () => {
    alert("Welcome to XYZ Bank");
};

const trigger = () => {
    document.getElementById("hover").addEventListener("mouseover", popup);  
};



function hideinstructions(btn){
    document.getElementById("instructions").style.display="none";
    btn.style.display="none";
}

const validateCustomer = () => {
    var custID = document.getElementById("custID").value;
    var validateCust = custID.includes("XYZ");

    if(validateCust) {
        document.write("Customer ID is valid, you can proceed further to generate coupon");
    } else if(custId === "") {
        document.write("Customer ID can't be blank");
    } else {
        document.write("You are not a valid customer");
    }
};

const generateCoupon = () => {
    var custId = document.getElementById("custID").value;
    var x = custId + "789456";
    var validateCust = custId.includes("XYZ");
    if(validateCust) {
        document.write("Your coupon is:" + x);
    } else if(custId === "") {
        document.write("Customer ID can't be blank");
    } else {
        document.write("Invalid customer ID so coupon can't be generated");
    }
};

const validateButton = document.getElementById("validate");
const genCoupBtn = document.getElementById("genCoupon");

validateButton.addEventListener("click", validateCustomer);
genCoupBtn.addEventListener("click", generateCoupon);