package com.journals.tsijournals.model;

import java.util.List;

public class CurrentIssueResponse {


    /**
     * status : true
     * message : Records Found
     * currentissue_details : [{"sno":"14537","month":"November","year":"2020","title":"Taguchi-base Six Sigma Methodology to Produce High Precision Products via HAAS Milling and Turning Centers","author_names":"Joseph Chen","abstractlink":"taguchibase-six-sigma-methodology-to-produce-high-precision-products-via-haas-milling-and-turning-centers-14537.html","pdflink":null,"fulltextlink":null,"sup_file":"","art_type":"Editorial","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0","volume":"8th International Conference and Exhibition on Mechanical and Aerospace"},{"sno":"13456","month":"December","year":"2017","title":"A Review on Computational Drug Designing.and Discovery","author_names":"Divya Paladugula","abstractlink":"a-review-on-computational-drug-designingand-discovery-13456.html","pdflink":"https://www.tsijournals.com/articles/a-review-on-computational-drug-designingand-discovery.pdf","fulltextlink":null,"sup_file":"","art_type":"Review","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0","volume":"Volume 3, Issue 3"},{"sno":"13598","month":"December","year":"2017","title":"Zika Virus (ZIKV) - An Uncommon Zoonotic Virus","author_names":"Bishnu Parida","abstractlink":"zika-virus-zikv--an-uncommon-zoonotic-virus-13598.html","pdflink":"https://www.tsijournals.com/articles/zika-virus-zikv--an-uncommon-zoonotic-virus.pdf","fulltextlink":null,"sup_file":"","art_type":"Review","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0","volume":"Volume 3, Issue 3"}]
     * currentissue_cnt : 3
     */

    private boolean status;
    private String message;
    private int currentissue_cnt;
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
     * art_type : Editorial
     * page_num :
     * doi_num :
     * doi_stat : 0
     * doi_stat_temp : 0
     * volume : 8th International Conference and Exhibition on Mechanical and Aerospace
     */

    private List<CurrentissueDetailsBean> currentissue_details;

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

    public int getCurrentissue_cnt() {
        return currentissue_cnt;
    }

    public void setCurrentissue_cnt(int currentissue_cnt) {
        this.currentissue_cnt = currentissue_cnt;
    }

    public List<CurrentissueDetailsBean> getCurrentissue_details() {
        return currentissue_details;
    }

    public void setCurrentissue_details(List<CurrentissueDetailsBean> currentissue_details) {
        this.currentissue_details = currentissue_details;
    }

    public static class CurrentissueDetailsBean {
        private String sno;
        private String month;
        private String year;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String art_type;
        private String page_num;
        private String doi_num;
        private String doi_stat;
        private String doi_stat_temp;
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

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
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

        public String getDoi_stat_temp() {
            return doi_stat_temp;
        }

        public void setDoi_stat_temp(String doi_stat_temp) {
            this.doi_stat_temp = doi_stat_temp;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }
    }
}
