var CSS3Demos = (function () {
    function isSelectorSupported(anySelector) {
        var newStyle = document.createElement("style"),
                cssRule = anySelector + "{}",
                isSupported = false,
                styles,
                rules,
                selectorText;
        newStyle.type = "text\/css";
        if (newStyle.styleSheet) {
            styles = newStyle.styleSheet;
            if (styles.cssText) {
                styles.cssText = cssRule;
                if (styles.rules) {
                    rules = styles.rules;
                    if (rules[0].selectorText) {
                        selectorText = rules[0].selectorText.toLowerCase();
                        isSupported = selectorText.indexOf("unknown") < 0;
                    }
                }
            }
        } else {
            newStyle.appendChild(document.createTextNode(cssRule));
            document.body.appendChild(newStyle);
            isSupported = !!newStyle.sheet.cssRules.length;
            document.body.removeChild(newStyle);
        }
        return isSupported;
    }
    return {
        isSelectorSupported: isSelectorSupported
    };
})();

// executes when page is loaded
$(function () {

    // behavior if :target not supported 

    // toggle animation by click

});