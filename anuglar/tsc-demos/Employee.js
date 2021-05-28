"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Batch = exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee() {
        this._firstName = '';
        this._lastName = '';
    }
    Object.defineProperty(Employee.prototype, "firstName", {
        get: function () { return this._firstName; },
        set: function (value) { this._firstName = value; },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "lastName", {
        get: function () { return this._lastName; },
        set: function (value) { this._lastName = value; },
        enumerable: false,
        configurable: true
    });
    Employee.prototype.display = function () {
        console.log('Employee: ' + this._firstName + ' ' + this._lastName);
    };
    return Employee;
}());
exports.Employee = Employee;
var Batch = /** @class */ (function () {
    function Batch() {
        this.employees = [];
    }
    return Batch;
}());
exports.Batch = Batch;
