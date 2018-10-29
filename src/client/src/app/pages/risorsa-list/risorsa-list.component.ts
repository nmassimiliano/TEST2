import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
// Import Services
import { RisorsaService } from '../../services/risorsa.service';
// Import Models
import { Risorsa } from '../../domain/test2_db/risorsa';

// START - USED SERVICES
/**
* RisorsaService.findBytecnologie
*	@description CRUD ACTION findBytecnologie
*	@param Objectid key Id della risorsa tecnologie da cercare
*
* RisorsaService.get
*	@description CRUD ACTION get
*	@param ObjectId id Id 
*
* RisorsaService.list
*	@description CRUD ACTION list
*
*/
// END - USED SERVICES

/**
 * This component shows a list of Risorsa
 * @class RisorsaListComponent
 */
@Component({
    selector: 'app-risorsa-list',
    templateUrl: './risorsa-list.component.html',
    styleUrls: ['./risorsa-list.component.css']
})
export class RisorsaListComponent implements OnInit {
    list: Risorsa[];
    search: any = {};
    idSelected: string;
    constructor(
        private risorsaService: RisorsaService,
    ) { }

    /**
     * Init
     */
    ngOnInit(): void {
        this.risorsaService.list().subscribe(list => this.list = list);
    }

    /**
     * Select Risorsa to remove
     *
     * @param {string} id Id of the Risorsa to remove
     */
    selectId(id: string) {
        this.idSelected = id;
    }

    /**
     * Remove selected Risorsa
     */
    deleteItem() {
        this.risorsaService.remove(this.idSelected).subscribe(data => this.list = this.list.filter(el => el._id !== this.idSelected));
    }

}
