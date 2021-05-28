function demo() {
    var name = '';
    var age;
    var isPostGraduate = false;
    var hobbies = ['reading', 1, 2, 3, true, 1.11];
    var preference = PreferredDomain.DevOps;
}
var PreferredDomain;
(function (PreferredDomain) {
    PreferredDomain[PreferredDomain["FullStack"] = 0] = "FullStack";
    PreferredDomain[PreferredDomain["FrontEnd"] = 1] = "FrontEnd";
    PreferredDomain[PreferredDomain["BackEnd"] = 2] = "BackEnd";
    PreferredDomain[PreferredDomain["DevOps"] = 3] = "DevOps";
})(PreferredDomain || (PreferredDomain = {}));
