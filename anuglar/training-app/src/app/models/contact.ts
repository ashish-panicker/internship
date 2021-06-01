export class Contact {

    name: string = '';
    email: string = '';
    query: string = '';
    domain: string = '';

    constructor(name: string, email: string, query: string, domain: string) {
        this.name = name;
        this.email = email;
        this.query = query;
        this.domain = domain;
    }

}
