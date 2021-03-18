package com.journals.tsijournals.model;

import java.util.List;

public class JournalsListResponse {


    /**
     * journal_cnt : 27
     * status : true
     * message : Records Found
     * journal_details : [{"managejournal":"Acta Chimica and Pharmaceutica Indica","journal":"tsacpi"},{"managejournal":"Analytical Chemistry: An Indian Journal","journal":"tsac"},{"managejournal":"Biochemistry & Molecular Biology Letters","journal":"tsbmbl"},{"managejournal":"BioChemistry: An Indian Journal","journal":"tsbc"},{"managejournal":"BioTechnology: An Indian Journal","journal":"tsbt"},{"managejournal":"Chemical Technology: An Indian Journal","journal":"tsct"},{"managejournal":"ChemXpress","journal":"tscx"},{"managejournal":"Environmental Science: An Indian Journal","journal":"tses"},{"managejournal":"Inorganic Chemistry: An Indian Journal","journal":"tsic"},{"managejournal":"International Journal of Chemical Sciences","journal":"tsijcs"},{"managejournal":"Journal of Cognitive and Developmental Psychology","journal":"tscdp"},{"managejournal":"Journal of Current Chemical and Pharmaceutical Sciences","journal":"tsjccps"},{"managejournal":"Journal of Food Science Research","journal":"tsfsr"},{"managejournal":"Journal of Ophthalmology & Eye Research","journal":"tsper"},{"managejournal":"Journal of Physics & Astronomy","journal":"tspa"},{"managejournal":"Journal of Space Exploration","journal":"tsse"},{"managejournal":"Macromolecules: An Indian Journal","journal":"tsm"},{"managejournal":"Materials Science: An Indian Journal","journal":"tsms"},{"managejournal":"Microbiology: An International Journal","journal":"tsmy"},{"managejournal":"Nano Science & Nano Technology: An Indian Journal","journal":"tsnsnt"},{"managejournal":"Natural Products: An Indian Journal","journal":"tsnp"},{"managejournal":"Organic Chemistry: An Indian Journal","journal":"tsoc"},{"managejournal":"Physical Chemistry: An Indian Journal","journal":"tspc"},{"managejournal":"Research & Reviews in BioSciences","journal":"tsrrb"},{"managejournal":"Research & Reviews in Electrochemistry","journal":"tsrre"},{"managejournal":"Research & Reviews in Polymer","journal":"tsrrp"},{"managejournal":"Scientific Reviews and Chemical Communications","journal":"tssrcc"}]
     */

    private int journal_cnt;
    private boolean status;
    private String message;
    /**
     * managejournal : Acta Chimica and Pharmaceutica Indica
     * journal : tsacpi
     */

    private List<JournalDetailsBean> journal_details;

    public int getJournal_cnt() {
        return journal_cnt;
    }

    public void setJournal_cnt(int journal_cnt) {
        this.journal_cnt = journal_cnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JournalDetailsBean> getJournal_details() {
        return journal_details;
    }

    public void setJournal_details(List<JournalDetailsBean> journal_details) {
        this.journal_details = journal_details;
    }

    public static class JournalDetailsBean {
        private String managejournal;
        private String journal;

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }
    }
}
