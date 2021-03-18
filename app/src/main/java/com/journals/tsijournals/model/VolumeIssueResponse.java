package com.journals.tsijournals.model;

import java.util.List;

public class VolumeIssueResponse {


    /**
     * status : true
     * vol_issue_details : [{"sno":"14537","month":"November","year":"2020","title":"Taguchi-base Six Sigma Methodology to Produce High Precision Products via HAAS Milling and Turning Centers","author_names":"Joseph Chen","abstractlink":"taguchibase-six-sigma-methodology-to-produce-high-precision-products-via-haas-milling-and-turning-centers-14537.html","pdflink":null,"fulltextlink":null,"sup_file":"","journal":"tsbmbl","page_num":"","doi_num":"","doi_stat":"0","art_type":"Editorial","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"},{"sno":"14538","month":"November","year":"2020","title":"LES of wind turbine modelling in farms and atmospheric conditions","author_names":"Steffan Ivannel","abstractlink":"les-of-wind-turbine-modelling-in-farms-and-atmospheric-conditions-14538.html","pdflink":null,"fulltextlink":null,"sup_file":"","journal":"tsbmbl","page_num":"","doi_num":"","doi_stat":"0","art_type":"Abstract","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"},{"sno":"14539","month":"November","year":"2020","title":"Aircraft Nonlinear Coupling Longitudinal Modes","author_names":"Ashraff Omran","abstractlink":"aircraft-nonlinear-coupling-longitudinal-modes-14539.html","pdflink":null,"fulltextlink":null,"sup_file":"","journal":"tsbmbl","page_num":"","doi_num":"","doi_stat":"0","art_type":"Abstract","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"},{"sno":"14540","month":"November","year":"2020","title":"An Optimal Strategy of Aircraft Turnaround Time for Passenger Boarding","author_names":"Fred Barez","abstractlink":"an-optimal-strategy-of-aircraft-turnaround-time-for-passenger-boarding-14540.html","pdflink":null,"fulltextlink":null,"sup_file":"","journal":"tsbmbl","page_num":"","doi_num":"","doi_stat":"0","art_type":"Abstract","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"},{"sno":"14541","month":"November","year":"2020","title":"DISCUSSION OF SOLUTIONS FOR COMBINING ROTATIONS","author_names":"Shuh Jing Ying","abstractlink":"discussion-of-solutions-for-combining-rotations-14541.html","pdflink":null,"fulltextlink":null,"sup_file":"","journal":"tsbmbl","page_num":"","doi_num":"","doi_stat":"0","art_type":"Abstract","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"},{"sno":"14542","month":"November","year":"2020","title":"Automation and Safety in the Cockpit","author_names":"Sabrina Craig","abstractlink":"automation-and-safety-in-the-cockpit-14542.html","pdflink":null,"fulltextlink":null,"sup_file":"","journal":"tsbmbl","page_num":"","doi_num":"","doi_stat":"0","art_type":"Abstract","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"}]
     * vol_issue : 6
     */

    private boolean status;
    private int vol_issue;
    /**
     * sno : 14537
     * month : November
     * year : 2020
     * title : Taguchi-base Six Sigma Methodology to Produce High Precision Products via HAAS Milling and Turning Centers
     * author_names : Joseph Chen
     * abstractlink : taguchibase-six-sigma-methodology-to-produce-high-precision-products-via-haas-milling-and-turning-centers-14537.html
     * pdflink : null
     * fulltextlink : null
     * sup_file :
     * journal : tsbmbl
     * page_num :
     * doi_num :
     * doi_stat : 0
     * art_type : Editorial
     * volume : 8th International Conference and Exhibition on Mechanical and Aerospace
     */

    private List<VolIssueDetailsBean> vol_issue_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVol_issue() {
        return vol_issue;
    }

    public void setVol_issue(int vol_issue) {
        this.vol_issue = vol_issue;
    }

    public List<VolIssueDetailsBean> getVol_issue_details() {
        return vol_issue_details;
    }

    public void setVol_issue_details(List<VolIssueDetailsBean> vol_issue_details) {
        this.vol_issue_details = vol_issue_details;
    }

    public static class VolIssueDetailsBean {
        private String sno;
        private String month;
        private String year;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String journal;
        private String page_num;
        private String doi_num;
        private String doi_stat;
        private String art_type;
        private String volume;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor_names() {
            return author_names;
        }

        public void setAuthor_names(String author_names) {
            this.author_names = author_names;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getSup_file() {
            return sup_file;
        }

        public void setSup_file(String sup_file) {
            this.sup_file = sup_file;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getPage_num() {
            return page_num;
        }

        public void setPage_num(String page_num) {
            this.page_num = page_num;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getDoi_stat() {
            return doi_stat;
        }

        public void setDoi_stat(String doi_stat) {
            this.doi_stat = doi_stat;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }
    }
}
