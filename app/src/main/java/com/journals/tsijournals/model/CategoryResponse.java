package com.journals.tsijournals.model;

import java.util.List;

public class CategoryResponse {


    /**
     * status : true
     * subcat_cnt : 3
     * subcat_details : [{"managejournal":"Biochemistry & Molecular Biology Letters","journal":"Biochemistry & Molecular Biology Letters","journalcode":"tsbmbl","rel_keyword":"articles","journal_logo":"","home_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.html","archive_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters-archive.html","ci_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters-current-issue.html","inst_url":"https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters-guidelines.html","flyerimg":"https://www.tsijournals.com/admin/flyers/biochemistry--molecular-biology-letters-flyer.jpg","track_paper":"https://www.scholarscentral.org/submissions/biochemistry-molecular-biology-letters.html","vol_issue_name":"Volume 3, Issue 3"},{"managejournal":"BioChemistry: An Indian Journal","journal":"BioChemistry: An Indian Journal","journalcode":"tsbc","rel_keyword":"articles","journal_logo":"","home_url":"https://www.tsijournals.com/journals/biochemistry-an-indian-journal.html","archive_url":"https://www.tsijournals.com/journals/biochemistry-an-indian-journal-archive.html","ci_url":"https://www.tsijournals.com/journals/biochemistry-an-indian-journal-current-issue.html","inst_url":"https://www.tsijournals.com/journals/biochemistry-an-indian-journal-guidelines.html","flyerimg":"https://www.tsijournals.com/admin/flyers/biochemistry-an-indian-journal-flyer.jpg","track_paper":"https://www.scholarscentral.org/submissions/biochemistry-an-indian-journal.html","vol_issue_name":"Volume 14, Issue 2"},{"managejournal":"Macromolecules: An Indian Journal","journal":"Macromolecules: An Indian Journal","journalcode":"tsm","rel_keyword":"articles","journal_logo":"","home_url":"https://www.tsijournals.com/journals/macromolecules-an-indian-journal.html","archive_url":"https://www.tsijournals.com/journals/macromolecules-an-indian-journal-archive.html","ci_url":"https://www.tsijournals.com/journals/macromolecules-an-indian-journal-current-issue.html","inst_url":"https://www.tsijournals.com/journals/macromolecules-an-indian-journal-guidelines.html","flyerimg":"https://www.tsijournals.com/admin/flyers/macromolecules-an-indian-journal-flyer.jpg","track_paper":"https://www.scholarscentral.org/submissions/macromolecules-an-indian-journal.html","vol_issue_name":"Volume 12, Issue 3"}]
     */

    private boolean status;
    private int subcat_cnt;
    /**
     * managejournal : Biochemistry & Molecular Biology Letters
     * journal : Biochemistry & Molecular Biology Letters
     * journalcode : tsbmbl
     * rel_keyword : articles
     * journal_logo :
     * home_url : https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters.html
     * archive_url : https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters-archive.html
     * ci_url : https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters-current-issue.html
     * inst_url : https://www.tsijournals.com/journals/biochemistry-molecular-biology-letters-guidelines.html
     * flyerimg : https://www.tsijournals.com/admin/flyers/biochemistry--molecular-biology-letters-flyer.jpg
     * track_paper : https://www.scholarscentral.org/submissions/biochemistry-molecular-biology-letters.html
     * vol_issue_name : Volume 3, Issue 3
     */

    private List<SubcatDetailsBean> subcat_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSubcat_cnt() {
        return subcat_cnt;
    }

    public void setSubcat_cnt(int subcat_cnt) {
        this.subcat_cnt = subcat_cnt;
    }

    public List<SubcatDetailsBean> getSubcat_details() {
        return subcat_details;
    }

    public void setSubcat_details(List<SubcatDetailsBean> subcat_details) {
        this.subcat_details = subcat_details;
    }

    public static class SubcatDetailsBean {
        private String managejournal;
        private String journal;
        private String journalcode;
        private String rel_keyword;
        private String journal_logo;
        private String home_url;
        private String archive_url;
        private String ci_url;
        private String inst_url;
        private String flyerimg;
        private String track_paper;
        private String vol_issue_name;

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

        public String getJournalcode() {
            return journalcode;
        }

        public void setJournalcode(String journalcode) {
            this.journalcode = journalcode;
        }

        public String getRel_keyword() {
            return rel_keyword;
        }

        public void setRel_keyword(String rel_keyword) {
            this.rel_keyword = rel_keyword;
        }

        public String getJournal_logo() {
            return journal_logo;
        }

        public void setJournal_logo(String journal_logo) {
            this.journal_logo = journal_logo;
        }

        public String getHome_url() {
            return home_url;
        }

        public void setHome_url(String home_url) {
            this.home_url = home_url;
        }

        public String getArchive_url() {
            return archive_url;
        }

        public void setArchive_url(String archive_url) {
            this.archive_url = archive_url;
        }

        public String getCi_url() {
            return ci_url;
        }

        public void setCi_url(String ci_url) {
            this.ci_url = ci_url;
        }

        public String getInst_url() {
            return inst_url;
        }

        public void setInst_url(String inst_url) {
            this.inst_url = inst_url;
        }

        public String getFlyerimg() {
            return flyerimg;
        }

        public void setFlyerimg(String flyerimg) {
            this.flyerimg = flyerimg;
        }

        public String getTrack_paper() {
            return track_paper;
        }

        public void setTrack_paper(String track_paper) {
            this.track_paper = track_paper;
        }

        public String getVol_issue_name() {
            return vol_issue_name;
        }

        public void setVol_issue_name(String vol_issue_name) {
            this.vol_issue_name = vol_issue_name;
        }
    }
}
