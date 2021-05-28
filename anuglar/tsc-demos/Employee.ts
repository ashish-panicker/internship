export class Employee {

    private _firstName: string = '';
    private _lastName: string = '';

    set firstName(value) { this._firstName = value; }

    set lastName(value) { this._lastName = value; }

    get firstName() { return this._firstName; }

    get lastName() { return this._lastName; }

    public display() {
        console.log('Employee: ' + this._firstName + ' ' + this._lastName);
    }

}

export class Batch {
    employees: Employee[] = [];
}

