# EPAM Project 26 - Assignment 1

## Overview
This project is a simple client-side web assignment for the XYZ Bank coupon validation scenario.

The user can:
- Enter a customer ID
- Validate the customer ID
- Generate a coupon code when the ID is valid
- Receive a welcome alert when hovering over the heading
- Hide the registration button after it is clicked

## Project Structure
- `Assignment - 1/Case Study - XYZ - bank scenerio 1.html` - main HTML page
- `Assignment - 1/app.js` - JavaScript logic for validation and coupon generation

## How to Use
1. Open `Assignment - 1/Case Study - XYZ - bank scenerio 1.html` in a web browser.
2. Hover over the heading to see the welcome alert.
3. Enter a customer ID in the input field.
4. Click `Validate customer` to check whether the ID includes `XYZ`.
5. Click `Click here to Register` to hide the register button.
6. Click `Click here to generate coupon` to create a coupon if the customer ID is valid.

## Notes
- The customer ID validation checks for the substring `XYZ`.
- A generated coupon appends `789456` to the entered customer ID.
- The form uses `document.write()` for output, which replaces the page content.

## Improvements
Possible enhancements include:
- Replacing `document.write()` with DOM updates for better page behavior
- Adding better form validation and user feedback
- Using valid button types and separating HTML/CSS for cleaner structure

## Contact
For questions or updates, open the HTML file and review the script in `Assignment - 1/app.js`.
